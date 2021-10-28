#include <iostream>
#include<NotesGestor.h>

int main(int argc, char** argv) {
	NotesGestor notes();
	notes.init();
	std::vector<NotaPrototype> score;
	score.push_back(notes.getNote(1).clone());
	score[0].print();
}
