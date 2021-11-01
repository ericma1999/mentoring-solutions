#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// declare functions
void printChar(char *word);

int main(void)
{
  char testWord[] = "This is a test";

  printChar(testWord);
  return 0;
}

void printChar(char *word)
{
  *word = 'P';

  while (*word != '\0')
  {
    // print original char,
    printf("%c \n", *(word++));
  }
}

// Will this work?
void printChar(char word[])
{
  *word = 'P';
  // This works for array because it puts the string in read-only memory and copies the string to newly allocated memory on the stack.

  while (*word != '\0')
  {
    // print original char,
    printf("%c \n", *(word++));
  }
}