#include <iostream>
#include"NotesGestor.h"
void printScore(std::vector<NotaPrototype*> score)
{
	std::cout<<"******************************** SPARTITO ******************************\n";
	for(auto elem: score)
	{
		std::cout<<" ";
		elem->print();
		std::cout<<" ";
	}

	std::cout<<"\n*************************************************************************\n";
}
int main(int argc, char** argv) {
	NotesGestor notes;
	notes.init();
	std::vector<NotaPrototype*> score;
	
	int choose=0;
	bool firstTime=true;
	while(choose!=-1)
	{

		switch(choose)
		{
			case 1: 
			score.push_back(notes.getNote(0)->clone());
			break;
			case 2: 
			score.push_back(notes.getNote(1)->clone());
			break;
			case 3: 
			score.push_back(notes.getNote(2)->clone());
			break;
			case 4: 
			delete score[score.size()-1];
			score.pop_back();
			break;
			default:
			break;
		}

		if(!firstTime)
		{
			printScore(score);
		}


		if(firstTime)
		{
			std::cout<<"Benvenuto nell'editor di spartiti \n";
			std::cout<<"Aggiungi una nota cliccando: \n";
			std::cout<<"1 per il do \n";
			std::cout<<"2 per il re \n";
			std::cout<<"3 per il mi \n";

			std::cout<<"Clicca 4 per togliere l'ultima nota inserita \n";
			firstTime=false;
		}

		std::cin>>choose;
	}

	for(auto elem: score)
	{
		delete elem;
	} 
	
}
