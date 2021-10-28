#ifndef NOTAPROTOTYPE_H
#define NOTAPROTOTYPE_H
#include<string>

class NotaPrototype
{
	public:
		NotaPrototype(){
		}
		
		virtual NotaPrototype clone(){}
		}
		virtual void print(){}
	
	protected:
		
	private:
		string note="";
		

};

#endif
