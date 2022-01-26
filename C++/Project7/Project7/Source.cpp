#include <iostream>
#include <string>
using namespace std;

//struct==class except struct=public and class=private by default
class Dog
{
public:

	Dog();

	string name;
	int age;
	float health;

	void bark()
	{
		cout << "Woof!" << endl;
	}
};

int main()
{
	Dog dog;

	cout << dog.name << endl;
	cout << dog.age << endl;
	cout << dog.health << endl;

	dog.name = "Sam";
	dog.age = 14;
	dog.health = 43.5;

	cout << dog.name << endl;
	cout << dog.age << endl;
	cout << dog.health << endl;
}

Dog::Dog()
{
	bark();

	name = "Default Name";
	age = 10;
	health = 100.f;
}