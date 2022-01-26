#include <iostream>
using namespace std;

/*
void AddToCount()
{
	static int count = 0;
	count++;
	cout << count << endl;
};


class Item
{
public:
	Item()
	{
		cout << "An item has been created\n";
	}
	~Item()
	{
		cout << "An item has been destroyed\n";
	}
};
*/

class Critter
{
public:
	Critter()
	{
		cout << "A critter is born!\n";
		CritterCount++;
	}

	static void AnnounceCount()
	{
		cout << CritterCount << endl;
	}

	static int CritterCount;
};

int Critter::CritterCount = 0;

int main()
{
	/*
	AddToCount();
	AddToCount();
	{
		static Item item;
	}
	
	Critter::CritterCount = 13;
	cout << Critter::CritterCount << endl;
	*/

	Critter::AnnounceCount;
	Critter* crit = new Critter;
	Critter::AnnounceCount;
	delete crit;
}