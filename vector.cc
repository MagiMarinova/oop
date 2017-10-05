#include <iostream>
#include <vector>

using namespace std;

int main(){
	vector<int> vi;

	cout << "vi size=" << vi.size() << endl;
	cout << "vi cap=" << vi.capacity() << endl;
	cout << "vi empty=" << vi.empty() << endl;

	vi.push_back(0); //dobawq element nakraq na vektora; moje da dobawim samo 1 element
	
	cout << "vi size=" << vi.size() << endl;
	cout << "vi cap=" << vi.capacity() << endl;
	cout << "vi empty=" << vi.empty() << endl;

	vi.push_back(1); 
	
	cout << "vi size=" << vi.size() << endl;
	cout << "vi cap=" << vi.capacity() << endl;

	vi.push_back(2); 
	
	cout << "vi size=" << vi.size() << endl;
	cout << "vi cap=" << vi.capacity() << endl; //vektora si dobawq oshte pamet kato uwelichawa capacity*2,towa stawa samo kogato stignem max capacity

	return 0;
}
