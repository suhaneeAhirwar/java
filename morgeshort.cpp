#include<iostream>
using namespace std;
void marge(int *arr,int s, int e){
    int  mid=(s+e)/2;
    int len1=mid-s+1;
    int len2 = e-mid;
    int *first =new int [len1];
    int *second =new int [len2];
    //copy values
    int mainArrayIndex=s;
    for(int i=0;i<len1;i++){
         first[i]=arr[mainArrayIndex++];
    }

 mainArrayIndex=mid+1;
    for(int i=0;i<len2;i++){
        second [i]=arr[mainArrayIndex];
    }
    //marge 2 sorted arrays;
    int index1=0;
    int  index2=0;
    mainArrayIndex=0;
    while(index1 <len1 && index2 <len2){
        if(first[index1]<second[index2]){
            arr[mainArrayIndex++]=first[index1++];
        }
        else{  arr[mainArrayIndex++]= second[index2++];
    }
        

}
while (index1<len1){
 arr[mainArrayIndex++]=first[index1++];

}
while(index2<len2){
     arr[mainArrayIndex++]= second[index2++];
    

}
}
void morgeshort(int *arr,int s,int e){
    //base case
    if(s>=e){
        return ;

    }
    int mid=(s+e)/2;
    morgeshort (arr,s,mid);
    morgeshort(arr,mid+1,e);
    morgeshort (arr,s,e);
}
int main(){
     int  arr[6]={ 3,6,5,4,9,7};
    int  n=6;
    morgeshort(arr,0,n-1);
    for(int i=0;i<n;i++){
    cout<< arr[i]<<" ";
    }
    return 0;
}


