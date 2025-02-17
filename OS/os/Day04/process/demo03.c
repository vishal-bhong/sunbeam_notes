#include<stdio.h>
#include<unistd.h>

int main(void)
{
	int ret;
	printf("program started !!!\n");
	ret = fork();
	printf("ret = %d\n", ret);
	if(ret == 0)
	{
		printf("child : pid = %d\n", getpid());
	}
	else
	{
		printf("parent : pid = %d\n", getpid());
	}

	printf("program finished !!!\n");
	return 0;
}

