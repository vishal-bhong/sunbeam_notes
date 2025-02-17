#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>

int main(void)
{
	int s;
	int ret = fork();
	if(ret == 0)
	{
		execl("/usr/bin/ls", "ls", "-l", NULL);
	}
	else
	{
		wait(&s);
	}
	return 0;
}




