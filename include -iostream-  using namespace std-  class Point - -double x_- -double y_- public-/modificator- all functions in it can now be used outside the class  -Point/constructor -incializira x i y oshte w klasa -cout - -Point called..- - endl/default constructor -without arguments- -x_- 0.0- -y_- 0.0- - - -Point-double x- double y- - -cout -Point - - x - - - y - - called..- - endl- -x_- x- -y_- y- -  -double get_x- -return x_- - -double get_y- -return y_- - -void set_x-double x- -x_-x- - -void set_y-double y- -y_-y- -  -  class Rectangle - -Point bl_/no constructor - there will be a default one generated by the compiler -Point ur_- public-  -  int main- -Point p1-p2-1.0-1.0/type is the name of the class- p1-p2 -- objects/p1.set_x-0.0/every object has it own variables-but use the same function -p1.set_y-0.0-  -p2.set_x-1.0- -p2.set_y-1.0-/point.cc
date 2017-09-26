#include <iostream> 
using namespace std;

class Point {
	double x_;
	double y_;
public: 	//modificator, all functions in it can now be used outside the class

	Point(){	//constructor ,incializira x i y oshte w klasa
		cout << "Point called.." << endl;	//default constructor ,without arguments		
		x_= 0.0;
		y_= 0.0;
	}
	
	Point(double x, double y) {
		cout <<"Point (" << x << "," << y << ") called.." << endl;
		x_= x;
		y_= y;
	}

	double get_x(){
		return x_;
	}
	double get_y(){
		return y_;
	}
	void set_x(double x){
		x_=x;
	}
	void set_y(double y){
		y_=y;
	}

};

class Rectangle {
	Point bl_;	//no constructor , there will be a default one generated by the compiler
	Point ur_;
public:

}

int main(){
	Point p1,p2(1.0,1.0);	//type is the name of the class; p1,p2 -> objects

/*	p1.set_x(0.0);	//every object has it own variables,but use the same function
	p1.set_y(0.0);	

	p2.set_x(1.0);
	p2.set_y(1.0);
*/
	cout << "p1=" << p1.get_x() << "," << p1.get_y() << endl;
	cout << "p2=" << p2.get_x() << "," << p2.get_y() << endl;

	Rectangle r;

	return 0;
}
