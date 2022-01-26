#include <iostream>
#include <string>
using namespace std;

struct LocationVector
{
	float x;
	float y;
	float z;
};

struct Player
{
	int level;
	float health;
	float damage;
	float stamina;

	LocationVector location = {0.f, 0.f, 0.f};

	void takeDamage(float dmg)
	{
		health -= dmg;
	}

	int getLevel()
	{
		if (level > 10) 
		{
			cout << "Level is greater than 10!\n";
		}
		return level;
	}

	void displayLocation() 
	{
		cout << "location.x = " << location.x << endl;
		cout << "location.y = " << location.y << endl;
		cout << "location.z = " << location.z << endl;
	}
};

int main()
{
	Player p1;
	p1.level = 1;
	p1.health = 100.f;
	p1.damage = 10.f;
	p1.stamina = 20.f;

	cout << "p1 Level = " << p1.getLevel() << endl;
	cout << "p1 health = " << p1.health << endl;

	p1.takeDamage(40.f);

	cout << "p1 takes " << 40.f << " damage!" << endl;
	cout << "p1 health = " << p1.health << endl;

	p1.displayLocation();

	Player p2 = { 1, 50.f, 40.f, 35.54f, {35.5f, 67.45f, 100.003f} };

	p2.displayLocation();
}