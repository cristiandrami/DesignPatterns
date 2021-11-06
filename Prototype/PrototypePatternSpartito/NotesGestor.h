#ifndef NOTESGESTOR_H
#define NOTESGESTOR_H
#include"NotaPrototype.h"
#include"Do.h"
#include"Re.h"
#include"Mi.h"

#include<vector>
class NotesGestor
{
	public:
		NotesGestor()
		{	
		}
		~NotesGestor()
		{
			for(auto elem: notes)
			delete elem;
		}
		
		void init()
		{
			Re* re= new Re();
			Do* do_= new Do();
			Mi* mi= new Mi();
			notes.push_back(do_);
			notes.push_back(re);
			notes.push_back(mi);
			
		}
		
		NotaPrototype* getNote(int index)
		{
			return notes[index];
		}
	protected:
	private:
	std::vector<NotaPrototype*> notes;
};

#endif
