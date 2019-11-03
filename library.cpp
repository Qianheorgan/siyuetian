#include<stdio.h>
#include<windows.h>
#include<stdlib.h>
#include<iostream>
#include<string.h>
#define ture 1
#define false 0
using namespace std;
//定义书的类型
typedef struct Book{
	int ISBN;
	char name[50];
	int price;
}Book;
//定义结点类
typedef struct Node{
	Book data;
	Node *next;
}Node, *LinkList;
//初始化
int InitList(LinkList &L, int n){
	//初始化的书本个数为n个
	cout << "请输入初始化书本数：";
		cin >> n;
	L = new Node;
	L->next = NULL;
	 Node *r;
	r = L;
	for (int i = 0; i < n; i++){
		 Node *p;
		p = new  Node;
		p->next = nullptr;
		cout << "请输入ISBN：";
		cin >> p->data.ISBN;
		cout << "请输入书名：";
        cin >> p->data.name;
		cout << "请输入价格：";
        cin >> p->data.price;
		r->next = p;   
		r = p;
	}
	return true;
}
//查找
 Node *FindBook(LinkList& L, char *Name){
	cout << "请输入要查找的书名:";
	cin >> Name;
	 
	 Node *p;
	p = L->next;
	while (p){
		if (strcmp(p->data.name, Name) == 0){
			cout << "找到了" << endl;
			cout << p->data.ISBN << "  " << p->data.name << "  " << p->data.price << endl;
			return  p;
		}
		else{
			p = p->next;
		}
	}
	cout << "没找到" << endl;
	
	return NULL;
}
//插入一本书
int InsertList(LinkList &L, Book book){
	 Node *head;
	head = L;
	 Node *b;
	b = new  Node;
	b->next = nullptr;
	cout << "要插入的ISBN:";
	cin >> book.ISBN;
	cout << "要插入的书名:";
	cin >> book.name;
	cout << "要插入的价格:";
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
//删除
void DeleteList(LinkList &L, char *Name){
	cout << "输入要删除的书名：";
	cin >> Name;
	 Node *p;
	p = L->next;
	 Node *pre;
	pre = L;
	while (p){
		if (strcmp(p->data.name, Name) == 0){
			pre->next = p->next;
			cout << "删除成功" << endl;
			return;
		}
		else{
			pre = p;
			p = p->next;
		}
	}
	cout << "没找到,删除不了" << endl;
}
//修改价格
void AlterList(LinkList &L, char *name, int price){
	Node*A = FindBook(L, name);
	cout << "输入修改后的价格:";
	cin >> price;
	if (A!=NULL){
		 
		A->data.price = price;
		cout << "修改成功！" << endl;
	}
	else{
		cout << "没找到，修改不了！！" << endl;
	}
}
 

//统计书本数
int Count(LinkList &L){
	 Node *p;
	p = L->next;
	int count = 0;
	while (p != nullptr){
		count++;
		p = p->next;
	}
	cout << "目前书本个数为：" << count << endl;
	return count;
}
//打印出所有信息
void PrintList(LinkList& L){
	//LinkList p;
	 Node *P;
	P = L->next;
	cout << "ISBN" << "\t\t\t\t" << "书名" << "\t\t\t\t" << "价格"   << endl;
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
		cout << "1、初始化书本数         " << endl;
		cout << "2、查找某一本书         " << endl;
		cout << "3、添加某一本书         " << endl;
		cout << "4、删除某一本书         " << endl;
		cout << "5、改变某一本书的价格   " << endl;
		cout << "6、打印出所有书本信息   " << endl;
		cout << "7、统计书本数           " << endl;
		cout << "8、退出系统             " << endl;
		cout << "************************" << endl;
		while (1){
			cout << "************************" << endl;
		cout << "请选择:" ;
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
				cout << "选择错误，请重新选择" << endl;
				break;
			}
		}

	 
	system("pause");
	return 0;
}