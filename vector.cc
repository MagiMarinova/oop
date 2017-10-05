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
	cout << "vi cap=" << vi.capacity() << endl;	
	
	vi.push_back(3); 
	
	cout << "vi size=" << vi.size() << endl;
	cout << "vi cap=" << vi.capacity() << endl; //vektora si dobawq oshte pamet kato uwelichawa capacity*2,towa stawa samo kogato stignem max capacity

	for(int i=0;i<vi.size();++i) {
		cout << "vi [" << i << "]=" << vi[i] << endl;
		vi[i] = i * 42;
	}

	vi.at(0)= -42; // proverqva dali vi[0] e v capacityto na tozi masiv i posle  mu dava stoinost -42

	for(int i=0;i<vi.size();++i) {
		cout << "vi [" << i << "]=" << vi[i] << endl;
	}

	//cout << vi[42] << endl; // kogato izlezem ot capacityto ni wrushta random stoinost
	//cout << vi.at(42) << endl; // proverqva dali e v capacityto/pametta na masiva

	vi.pop_back(); // pri pop capacityto ne namalqwa , samo size
	cout << "vi size=" << vi.size() << endl;
	cout << "vi cap=" << vi.capacity() << endl;

	vector<double> vd(100);	//imame 100 elementa
	cout << "vd size=" << vd.size() << endl;
	cout << "vd cap=" << vd.capacity() << endl;

	for(int i=0;i<vd.size();++i) {
		vi[i] = i * 3.14;
	}
	
	vd.push_back(100*3.14); //dobavqme oshte edin element
	cout << "vd size=" << vd.size() << endl;
	cout << "vd cap=" << vd.capacity() << endl;

	for(vector<int>::iterator it=vi.begin() ; it!=vi.end() ; ++it) { //suzdavame iterator i mu davame stoinosta na nachalniq element na vi vektora ; : : razreshavat da wlojim klasa iterator v klasa vector
		cout << "*it=" << *it << endl;
	}
	return 0;
}
