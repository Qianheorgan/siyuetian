#include<stdio.h>
#include<windows.h>
#include<stdlib.h>
#include<iostream>
#include<string.h>
#define ture 1
#define false 0
using namespace std;
//�����������
typedef struct Book{
	int ISBN;
	char name[50];
	int price;
}Book;
//��������
typedef struct Node{
	Book data;
	Node *next;
}Node, *LinkList;
//��ʼ��
int InitList(LinkList &L, int n){
	//��ʼ�����鱾����Ϊn��
	cout << "�������ʼ���鱾����";
		cin >> n;
	L = new Node;
	L->next = NULL;
	 Node *r;
	r = L;
	for (int i = 0; i < n; i++){
		 Node *p;
		p = new  Node;
		p->next = nullptr;
		cout << "������ISBN��";
		cin >> p->data.ISBN;
		cout << "������������";
        cin >> p->data.name;
		cout << "������۸�";
        cin >> p->data.price;
		r->next = p;   
		r = p;
	}
	return true;
}
//����
 Node *FindBook(LinkList& L, char *Name){
	cout << "������Ҫ���ҵ�����:";
	cin >> Name;
	 
	 Node *p;
	p = L->next;
	while (p){
		if (strcmp(p->data.name, Name) == 0){
			cout << "�ҵ���" << endl;
			cout << p->data.ISBN << "  " << p->data.name << "  " << p->data.price << endl;
			return  p;
		}
		else{
			p = p->next;
		}
	}
	cout << "û�ҵ�" << endl;
	
	return NULL;
}
//����һ����
int InsertList(LinkList &L, Book book){
	 Node *head;
	head = L;
	 Node *b;
	b = new  Node;
	b->next = nullptr;
	cout << "Ҫ�����ISBN:";
	cin >> book.ISBN;
	cout << "Ҫ���������:";
	cin >> book.name;
	cout << "Ҫ����ļ۸�:";
	cin >> book.price;
	b->data.ISBN = book.ISBN;
	
	memcpy(b->data.name, book.name, sizeof(book.name));
	
	b->data.price = book.price;
	if (head->next == NULL){
		head->next = b;
	}
	else{
		b->next = head->next;
		head->next = b;
	}
	return true;
}
//ɾ��
void DeleteList(LinkList &L, char *Name){
	cout << "����Ҫɾ����������";
	cin >> Name;
	 Node *p;
	p = L->next;
	 Node *pre;
	pre = L;
	while (p){
		if (strcmp(p->data.name, Name) == 0){
			pre->next = p->next;
			cout << "ɾ���ɹ�" << endl;
			return;
		}
		else{
			pre = p;
			p = p->next;
		}
	}
	cout << "û�ҵ�,ɾ������" << endl;
}
//�޸ļ۸�
void AlterList(LinkList &L, char *name, int price){
	Node*A = FindBook(L, name);
	cout << "�����޸ĺ�ļ۸�:";
	cin >> price;
	if (A!=NULL){
		 
		A->data.price = price;
		cout << "�޸ĳɹ���" << endl;
	}
	else{
		cout << "û�ҵ����޸Ĳ��ˣ���" << endl;
	}
}
 

//ͳ���鱾��
int Count(LinkList &L){
	 Node *p;
	p = L->next;
	int count = 0;
	while (p != nullptr){
		count++;
		p = p->next;
	}
	cout << "Ŀǰ�鱾����Ϊ��" << count << endl;
	return count;
}
//��ӡ��������Ϣ
void PrintList(LinkList& L){
	//LinkList p;
	 Node *P;
	P = L->next;
	cout << "ISBN" << "\t\t\t\t" << "����" << "\t\t\t\t" << "�۸�"   << endl;
	while (P != NULL){
		cout << P->data.ISBN << "\t\t\t\t" << P->data.name << "\t\t" << P->data.price << endl;
		P = P->next;
	}
}
 
 

int main(){
	LinkList L;
	int n=0;
	int z;
	Book book= Book();
	char Name[50] = {};
	char Name2[50] = {};
	char Name3[50] = {};
	int price = 0;
	
		cout << "************************" << endl;
		cout << "1����ʼ���鱾��         " << endl;
		cout << "2������ĳһ����         " << endl;
		cout << "3�����ĳһ����         " << endl;
		cout << "4��ɾ��ĳһ����         " << endl;
		cout << "5���ı�ĳһ����ļ۸�   " << endl;
		cout << "6����ӡ�������鱾��Ϣ   " << endl;
		cout << "7��ͳ���鱾��           " << endl;
		cout << "8���˳�ϵͳ             " << endl;
		cout << "************************" << endl;
		while (1){
			cout << "************************" << endl;
		cout << "��ѡ��:" ;
		cin >> z;
		
			switch (z){
			case 1:
				InitList(L, n);
				break;
			case 2:
				FindBook(L, Name);
				break;
			case 3:
				InsertList(L, book);
				break;
			case 4:
				DeleteList(L, Name2);
				break;
			case 5:
				AlterList(L, Name3, price);
				break;
			case 6:
				PrintList(L);
				break;
			case 7:
				Count(L);
				break;
			case 8:
				exit(0);
		    default:
				cout << "ѡ�����������ѡ��" << endl;
				break;
			}
		}

	 
	system("pause");
	return 0;
}