#include <iostream>
#include <string>
using namespace std;

class Animal
{
public:
	Animal();
	Animal(string n, int a, int nol);

	string name;
	int age;
	int numberOfLimbs;

	void report();
};

class Dog : public Animal
{
public:
	Dog();
	Dog(string n, int a, int nol);
	void speak();
};

class Corgi : public Dog
{

};

int main() 
{
	Corgi corgi;
	corgi.speak();
	corgi.report();
}

Animal::Animal()
{
	cout << "An ANIMAL is born!\n";

	name = "DEFAULT";
	age = 2;
	numberOfLimbs = 4;
}

/*Animal::Animal(string n,int a,int nol)
{
	cout << "An ANIMAL is born!\n";

	name = n;
	age = a;
	numberOfLimbs = nol;
}
Same as below*/

Animal::Animal(string n,int a,int nol):name(n),age(a),numberOfLimbs(nol)
{
	report();
}

void Animal::report()
{
	cout << endl;
	cout << "Name: " << name << endl;
	cout << "Age: " << age << endl;
	cout << "Number of Limbs: " << numberOfLimbs << endl;
	cout << endl;
}

Dog::Dog()
{
	cout << "A DOG is born!\n";
}

Dog::Dog(string n, int a, int nol):Animal(n, a, nol)
{

}

void Dog::speak()
{
	cout << "Woof!\n";
}