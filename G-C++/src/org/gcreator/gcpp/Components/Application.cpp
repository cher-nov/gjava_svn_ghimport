#ifndef _GCPP_COMPONENTS_APPLICATION_
#define _GCPP_COMPONENTS_APPLICATION_

#include "../compilers/declare.h"

org::gcreator::Components::Application::Application(int _argc, char** _argv){
        this->argc = argc;
	this->argv = argv;
	while(!org::gcreator::Interaction::Keyboard::isKeyPressed(SDLK_ESCAPE))
        {
            ;
        }
}

SDL_Surface org::gcreator::Components::Application::gameInit(int W, int H, int BPP, std::string caption=""){
        SDL_Surface *screen
        if(SDL_Init(SDL_INIT_EVERYTHING)==-1){
            return 1;
        }
        screen=SDL_SetVideoMode(W,H,BPP,SDL_SWSURFACE);
        if(screen==NULL){
            return 1;
        }
        SDL_WM_SetCaption(caption.c_str(), NULL)
        return screen;
}

org::gcreator::Components::Application* Game;

#endif
