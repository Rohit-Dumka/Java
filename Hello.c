include<stdio.h>

main(){

    int character=0, words=0, lines=0;

    char file_name[100], ch, prev=' ';

    FILE *fp=NULL;

    printf("enter file name : ");

    scanf("%s",file_name);

    fp = fopen(file_name, "r");

    if(fp==NULL){

        printf("file can't open");

    }

    else{

        while((ch=fgetc(fp))!=EOF){

            if(ch!=' ' && ch!='\n') character++;

            if((ch!=' ' && ch!='\n') && (prev==' ' || prev=='\n')){

                words++;

            }

            else if(ch=='\n') lines++;

            prev = ch;

        }

        printf("characters : %d\n",character);

        printf("words : %d\n",words);

        if(character!=0) lines++;

        printf("lines : %d",lines);

        fclose(fp);

    }

}
