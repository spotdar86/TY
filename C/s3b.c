#include<stdio.h>
#include<stdlib.h>
#include<time.h>

struct process{
    int id;
    int arrivalTime;
    int initialCpuBurst;
    int remainingCpuBurst;
    int turnaroundTime;
    int waitingTime;
};

//function to sort processes by arrival time;
void sortByArrivalTime(struct process processes[],int n)
{
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(processes[i].arrivalTime>processes[j].arrivalTime)
            {
                struct process temp = processes[i];
                processes[i]=processes[j];
                processes[j]=temp;
            }
        }
    }
}
int main()
{
    srand(time(NULL));
    int n,i;
    printf("enter the number of processes");
    scanf("%d",&n);

    struct process processes[n];
    for (i=0;i<n;i++)
    {
        processes[i].id=i;
        printf("enter arrival time for process p%d:",i);
        scanf("%d",&processes[i].arrivalTime);
        printf("enter initial cpu burst for process p%d:",i);
        scanf("%d",&processes[i].initialCpuBurst);
        processes[i].remainingCpuBurst=processes[i].initialCpuBurst;
    }
    sortByArrivalTime(processes,n);

    int currentTime=0;
    int totalTurnaroundTime=0;
    int totalwaitingTime=0;

    printf("\n gantt chart: \n");
    printf("0");

    for(i=0;i<n;i++)
    {
        if(processes[i].arrivalTime >currentTime)
        {
            currentTime=processes[i].arrivalTime;
        }
        printf("|P%d",processes[i].id);
        processes[i].waitingTime=currentTime-processes[i].arrivalTime;
        totalwaitingTime += processes[i].waitingTime;

    
    currentTime += processes[i].remainingCpuBurst;

    processes[i].turnaroundTime = currentTime - processes[i].arrivalTime;
    totalTurnaroundTime += processes[i].turnaroundTime;
    }
printf("|\n");

printf("\nprocesses\tTurnaround time\tWaiting Time\n");
for(i=0;i<n;i++)
{
    printf("p%d\t%d\t\t%d\n",i,processes[i].turnaroundTime,processes[i].waitingTime);

}

float averageTurnaroundTime=(float) totalTurnaroundTime /n;
float averageWaitingTime=(float) totalwaitingTime /n;

printf("average Waiting time:%.2f\n",averageWaitingTime);
printf("average Turnaround Time:%.2f\n",averageTurnaroundTime);
return 0;
}
