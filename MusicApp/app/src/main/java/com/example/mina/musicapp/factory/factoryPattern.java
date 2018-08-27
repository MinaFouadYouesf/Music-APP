package com.example.mina.musicapp.factory;

public class factoryPattern {

    int position;
  public factoryPattern(int position){
        this.position=position;
    }

    public albumsInterface videos_demo(){
      if(position==0){return new album_1();}
      else if(position==1){return new album_2();}
      else if(position==2){return new album_3();}
      else if(position==3){return new album_4();}
      else if(position==4){return new album_5();}
      else if(position==5){return new album_6();}
      else if(position==6){return new album_7();}
      else if(position==7){return new album_8();}
      else if(position==8){return new album_9();}
      else if(position==9){return new album_10();}
      else  return  null;

    }
}
