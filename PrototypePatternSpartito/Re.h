#ifndef RE_H
#define RE_H

class Re : public NotaPrototype
{
public:
		Re(){
			note="re";
		}
		void print()
		{
			std::cout<<note;
		}
		Re clone()
		{
			return this;
		}
	protected:
};

#endif
