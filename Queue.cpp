#define _CRT_SECURE_NO_WARNINGS 1
#include<string>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<iostream>
#define Maxn 100
#define QueueSize 100
using namespace std;
typedef struct QElemType{
	string name;
	 
	 
}QElemType;
typedef struct {
	QElemType *base;
	int Front, Rear;
}CQueue;
void InitQueue(CQueue &Q){
	Q.base = new QElemType[QueueSize];
	Q.Front = Q.Rear = 0;
}
void EnQueue(CQueue &Q, QElemType e){
	Q.base[Q.Rear] = e;
	Q.Rear = (Q.Rear + 1) % Maxn;
}
void DeQueue(CQueue &Q, QElemType e){
	if (Q.Front == Q.Rear){
		printf("error !!! Queue is empty !!!\n"); return;
	}
	
	    e = Q.base[Q.Front++];
		cout << e.name;
		Q.Front = Q.Front%Maxn;
		 
	
	
}
void GetHead(CQueue &Q){
	if (Q.Front == Q.Rear){
		printf("error !!! Queue is empty !!!\n"); return;
	}
	QElemType e;
	e = Q.base[Q.Front];
	cout << e.name<<endl;
}
void PartnerPairing(CQueue &Qm, CQueue &Qw){
	int n, m, Min;
	m = (Qm.Rear - Qm.Front + Maxn) % Maxn;
	n = (Qw.Rear - Qw.Front + Maxn) % Maxn;
	printf("%d  %d\n", n, m);
	Min = m<n ? m : n;
	QElemType man, woman ;
	 
		for (int j = 0; j<Min; j++){
			DeQueue(Qm,man); 
			cout   << "<----->"  ;
			DeQueue(Qw, woman);
			cout << endl;
		}
		 
	
}
void isEmpty(CQueue& L){
	if (L.Front == L.Rear){
		cout << "����Ϊ��"<<endl;

	}
	else{
		cout << "���в�Ϊ��"<<endl;
	}
}
int main()
{
	int n, m, a;
	QElemType  man, woman;
	CQueue Qm, Qw;
	cout << "********************" << endl;
	cout << "1����ʼ��           " << endl;
	cout << "2�������           " << endl;
	cout << "3��ȡ��ͷԪ��       " << endl;
	cout << "4���ж��Ƿ�Ϊ��     " << endl;
	cout << "5������ƥ�䲢������ " << endl;
	cout << "6���˳�             " << endl;
	cout << "********************" << endl;

	while (1){
		cout << "********************" << endl;

		cout << "��ѡ��" << endl;

		cin >> a;
		switch (a){
		case 1:
			InitQueue(Qm), InitQueue(Qw);
			

			break;
		case 2:printf("��������� ������,Ů���߸�����: \n");
			cin >> n >> m;
			printf("�����������ߵ�����\n", n);
			for (int i = 0; i < n; i++){
				printf("��%dλ ������ name   \n", i + 1);
				cin >> man.name;
				EnQueue(Qm, man);

			}
			printf("������Ů���ߵ����� \n", m);
			for (int i = 0; i < m; i++){
				printf("��%dλ Ů���� name   \n", i + 1);
				cin >> woman.name;
				EnQueue(Qw, woman);
			}
			break;
		case 3:
			GetHead(Qm);
			cout << endl;

		    GetHead(Qw);
			break;
		case 4:
			isEmpty(Qm);
			cout << endl;
			isEmpty(Qw);
			break;
		 
		case 5:
			PartnerPairing(Qm, Qw);
			break;
		case 6:
			exit(0);
		default:
			break;

		}
		
	}
	system("pause");
	return 0;
}