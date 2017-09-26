#include <iostream>
using namespace std;

#define STACK_SIZE 10
class Stack {
	int data_[SATCK_SIZE];
	int top_;
public:
	Stack() {
		top_= 0;
	}
	
	bool empty(){
		return top_ == 0;
	}
	
	bool full(){
		return top_ == STACK_SIZE;
	}

	void push(int val) {
		if(full()) {
			cout<< "OOPS!" << endl;
		}
		data_[top_++] = val;

	}
	
	int pop(){
		if(empty()) {
			cout << "OOPS!" << endl;
			return -1;
		}
		return data_[--top_];
	}

};

int main() {
	Stack st;
	cout << st.push << endl;
	cout << st.pull << endl;
	return 0;
}
