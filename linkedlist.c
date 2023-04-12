
#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

void print(struct Node* temp){
    
    while(temp!=NULL){
        printf("%d  ",temp->data);
        temp=temp->next;
    }
    printf("\n");
}
void InsertAtHead(struct Node** head,int data){
    struct Node* temp ;
    temp=(struct Node*)malloc(sizeof(struct Node));
    if(*head==NULL){
         (*head)->data=data;
         (*head)->next=NULL;
         return;
    }
    temp->data=data;
    temp->next=*head;
    *head=temp;

}
void InsertAtLast(struct Node** head,int data){
    struct Node* temp ;
        struct Node* curr=*head;
        
        temp=(struct Node*)malloc(sizeof(struct Node));
        temp->data=data;
        temp->next=NULL;
    if(*head==NULL){
        
         *head=temp;
         return;
    }
    while(curr->next!=NULL){
        curr=curr->next;
    }
    curr->next=temp;
    

}
void InsertAtPosition(struct Node** head,int pos){
    struct Node* temp ;
        struct Node* curr=*head;
        struct Node* prev;
        
        temp=(struct Node*)malloc(sizeof(struct Node));
        temp->data=4;
        temp->next=NULL;
        int t=1;
        while(t<pos){
            prev=curr;
            curr=curr->next;
            
            t++;
        }
        temp->next=prev->next;
        prev->next=temp;
}
void DeleteAtPosition(struct Node** head,int pos){
    
        struct Node* curr=*head;
        struct Node* prev;
        int t=1;
        while(t<pos){
            prev=curr;
            curr=curr->next;
            t++;
        }
        prev->next=curr->next;
}
int main(){
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    head->data=1;
    head ->next = second;
    second ->data=2;
    second ->next=third;
    third ->data=3;
    third ->next=NULL;
    print(head);
    InsertAtHead(&head,0);
    print(head);
    InsertAtLast(&head,5);
    print(head);
    InsertAtPosition(&head,5);
    print(head);
   
    DeleteAtPosition(&head,6);
    print(head);
     return 0;
}