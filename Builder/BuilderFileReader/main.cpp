#include"txtBuilder.h"
#include"director.h"
#include<vector>
#include <algorithm>
#include<fstream>
#include"reverseTxtBuilder.h"
void printChoose()
{
    std::cout<<"Clicca 1 per creare il file in .txt\n";
    std::cout<<"Clicca 2 per creare il file al contrario in .txt\n";
}
int main()
{

    FileBuilder* fileBuilder;
    
    
    int choose=0;
    std::vector<int> possibleChooses={1,2};

    printChoose();
    std::cin>>choose;
    while(! std::count(possibleChooses.begin(), possibleChooses.end(), choose))
    {
        std::cout<<"Attenzione, il numero cliccato non corrisponde a nessuna scelta, ritenta\n";
        std::cin>>choose;
    }

    switch(choose)
    {
        case 1:
        fileBuilder= new TxtBuilder();
        break;

        case 2:
        fileBuilder= new ReverseTxtBuilder();
        break;

        default:
        break;

    }

    Director director(fileBuilder);

    
    director.parse();

    delete fileBuilder;
}