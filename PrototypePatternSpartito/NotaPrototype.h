#ifndef NOTAPROTOTYPE_H
#define NOTAPROTOTYPE_H
#include<string>

class NotaPrototype
{
	public:
		NotaPrototype(){
		}
		std::string note="";
		
		virtual NotaPrototype* clone()=0;
		virtual void print()=0;
	
	protected:
		
	private:
		
		

};

#endif
