#include <iostream>
#include <string>
using namespace std;

enum PlayerStatus
{
	PS_Running,
	PS_Walking,
	PS_Crouching
};

const float RUNSPEED = 800.f;
const float WALKSPEED = 500.f;
const float CROUCHSPEED = 350.f;

void updateMovementSpeed(PlayerStatus P_Status, float& speed);

int main()
{
	float movementSpeed;

	PlayerStatus status = PS_Walking;
	updateMovementSpeed(status, movementSpeed);

	cout << "movementSpeed = " << movementSpeed << endl;
}

void updateMovementSpeed(PlayerStatus P_Status, float& speed)
{
	switch (P_Status) {
	case PS_Running:
		speed = RUNSPEED;
		break;
	case PS_Walking:
		speed = WALKSPEED;
		break;
	case PS_Crouching:
		speed = CROUCHSPEED;
		break;
	default:
		speed = 0;
	}
}