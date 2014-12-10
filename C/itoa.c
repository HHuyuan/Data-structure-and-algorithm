#include <stdio.h>
#include <ctype.h>

#define ARRAY_LENGTH 100

char* itoa(int i);
char* ftoa(double i,int len);
int atoi(char s[]);
double atof(char s[]);

char* reverse(char* s);
int length_of_array(char a[]);
void copy(char to[],char from[]);




char* itoa(int i)
{
	static char ch[ARRAY_LENGTH];
	int sign = (i > 0) ? 1 : -1;
	int t = 0;
	if (sign < 0)
	 	i = -i;
	do
	{
		ch[t] = i%10 + '0';
		t++;
		i = i/10;
	}while(i>0);
	if (sign < 0)
		ch[t] = '-';

	return reverse(ch);
}

char* ftoa(double i,int len)   //len是小数部分长度
{
	static char f[ARRAY_LENGTH];
	int sign = (i > 0) ? 1 : -1;
	if (sign < 0)
	 	i = -i;
	int i_part = i/1;
	double f_part = i - i_part;

    int t = 0;
	do
	{
		f[t] = i_part%10 + '0';
		t++;
		i_part = i_part/10;
	}while(i_part>0);
    reverse(f);
	
	f[t++] = '.';
    int k = 0;
	do
	{
		f[t] = (int)(f_part*10) + '0';
		f_part = f_part*10.0 - (int)(f_part*10);	
		t++;
		k++;
	}while(f_part > 0 && k < len);
	reverse(f);
	if (sign < 0)
		f[t] = '-';
	reverse(f);
	return f;
}

int atoi(char s[])
{
	int i,n;
	n = 0;
	for (i = 0; s[i]>='0' && s[i]<='9' ; ++i)
	{
		n = 10*n + (s[i]-'0');
	}
	return n;	
}

double atof(char s[])
{
	double val,power;
	int i = 0;
	int	sign = (s[i] == '-') ? -1 : 1;
	if (s[i] == '+' || s[i] == '-')
		i++;
	for (val = 0.0; isdigit(s[i]) ; i++)
		val = 10.0 * val + (s[i] - '0');
	if (s[i] == '.')
		i++;
	for (power = 1.0; isdigit(s[i]); i++)
	{
		val = 10.0 * val + + (s[i] - '0');
		power = power * 10.0;
	}
	return sign * val / power;
}

char* reverse(char* s)
{
	char temp;
	char* p = s;     //指向s的头
	char* q = s;     //指向s的尾

	while(*q != '\0')
		q++;
	q--;

	while(p < q)  
    {  
        temp = *p;  
        *p++ = *q;  
        *q-- = temp;  
    }  
    return s; 
}

int length_of_array(char a[])
{
	int i = 0;
	while(a[i]!='\0')
		i++;
	return i;
}


void copy(char to[],char from[]) //至少保证to的空间和from一样大
{
	char* p_to = to;
	char* p_from = from;
	while((*(p_to++) = * (p_from++)) != '\0')  
		;
}

int main()
{
	char a[] = "1234567890";
	char b[] = "1234.23";
	int a_ = atoi(a);
	double b_ = atof(b);
	printf("%d\n",a_ );
	printf("%f\n",b_ );

	int c = -1234567890;
	double d = -1234.23;
	char* c_ = itoa(c);
	char* d_ = ftoa(d,2);  
	printf("%s\n",c_ );
	printf("%s\n",d_ );

	return 0 ;
}

