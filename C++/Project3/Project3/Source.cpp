#include <iostream>
#include <string>
using namespace std;

enum PlayerStatus 
{
	PS_Crouched,
	PS_Standing,
	PS_Walking,
	PS_Running
};

enum MovementStatus
{
	MS_Crouched,
	PS_Running				//Error in naming means you have to use PlayerStatus:: on line 29
};

int main() 
{
	PlayerStatus status;
	status = PS_Crouched;

	if (status == PS_Crouched)
	{
		cout << "The player is crouching! \n";
	}

	status = PlayerStatus::PS_Running;

	if (status == PS_Crouched)
	{
		cout << "The player is crouching! \n";
	}
}