#ifndef DO_H
#define DO_H

class Do: public NotaPrototype
{
	public:
		Do(){
			note="do";
		}
		void print()
		{
			std::cout<<note;
		}
		NotaPrototype* clone()
		{
			return new Do(*this);
		}	
	protected:
};

#endif
