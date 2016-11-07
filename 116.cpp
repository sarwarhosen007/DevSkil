#include<iostream>
using namespace std;
int main(){

int t,n,flag = 0;
cin>>t;
for(int i = 0; i<t; i++){
    cin>>n;
    for(int i = 2; i<=n/2; ++i){
        if(n%i==0){
            flag = 1;
            break;
        }
    }
    if(flag == 0){
        cout<<"Yes";
    }else{
        cout<<"No";
      }
}



return 0;
}
