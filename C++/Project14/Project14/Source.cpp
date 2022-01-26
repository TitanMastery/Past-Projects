#include <iostream>
#include "Pawn.h"
using namespace std;

void InheritanceFuction() 
{
	Object* ptr_to_object = new Object;
	Actor* ptr_to_actor = new Actor;
	Pawn* ptr_to_pawn = new Pawn;

	Object* ObjectArray[] = {ptr_to_object, ptr_to_actor, ptr_to_pawn};

	for (int i = 0; i < 3; i++) 
	{
		//ObjectArray[i]->BeginPlay();
		Object* obj = ObjectArray[i];
		Actor* act = dynamic_cast<Actor*>(obj);
		Pawn* pwn = dynamic_cast<Pawn*>(obj);
		if (pwn) 
		{
			pwn->pawnFunction();
		}
		else if (act) 
		{
			act->actorFunction();
		}
		else 
		{
			obj->objectFunction();
		}
	}
	delete ptr_to_object;
	delete ptr_to_actor;
	delete ptr_to_pawn;
}

int main() 
{
	InheritanceFuction();
}