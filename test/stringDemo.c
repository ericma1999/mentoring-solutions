#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// declare functions
void printChar(char *word);

int main(void)
{
  char *testWord = "This is a test";

  printChar(testWord);
  return 0;
}

void printChar(char *word)
{

  while (*word != '\0')
  {
    // print original char,
    printf("%c \n", *(word++));
  }
}