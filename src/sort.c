//#include "header.h"   //Anycodes includes the head file by default, needn't cancle the notation.
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ALENGTH 10
#define SQ true //1 asc 0 desc

void swapQ(int& m,int& n){
    if(m>n&&SQ){
        int s=n;
        n=m;
        m=s;
    }
}

void swap(int& m,int& n){
    int s=n;
    n=m;
    m=s;
}

void quikSort(int a[],int f,int e){
    if(f<e){
        int p=f+1;
        int t=e;
        while(p<t){
            if(a[p]>a[f]){
                swap(a[p],a[t]);
                t--;
            }else{
                p++;
            }
        }
        if(a[f]<=a[p]){
            p--;
        }
        swap(a[f],a[p]);
        quikSort(a,f,p);
        quikSort(a,t,e);
}
}

int main(void)
{
    srand ((int)time(NULL));
    int a[ALENGTH];
    for (int i=0;i<ALENGTH;i++){
        a[i]=rand()%100;
    }
    quikSort(a,0,ALENGTH-1);
    for(int i=0;i<ALENGTH;i++){
        printf("%d\n",a[i]);    
    }
	return EXIT_SUCCESS;
}
