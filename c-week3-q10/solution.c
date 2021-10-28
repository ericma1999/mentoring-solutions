

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// declare functions
void big0(int line);
void big1(int line);
void big2(int line);
void big3(int line);
void big4(int line);
void big5(int line);
void big6(int line);
void big7(int line);
void big8(int line);
void big9(int line);

int main(void)
{
  // accept user input
  char input[1000];
  // prompt the user for input
  printf("please input a number: ");
  scanf("%s", input);

  int length_input = strlen(input);

  // do a loop for each case for the number
  for (int i = 1; i <= 5; i++)
  {

    // inner loop through each of the number
    for (int j = 0; j < length_input; j++)
    {
      switch (input[j])
      {
      case '0':
        big0(i);
        break;
      case '1':
        big1(i);
        break;
      case '2':
        big2(i);
        break;
      case '3':
        big3(i);
        break;
      case '4':
        big4(i);
        break;
      case '5':
        big5(i);
        break;
      case '6':
        big6(i);
        break;
      case '7':
        big7(i);
        break;
      case '8':
        big8(i);
        break;
      case '9':
        big9(i);
        break;
      }
    }
    printf("\n");
  }

  return 0;
}

void big0(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("*    * ");
    break;
  case 3:
    printf("*    * ");
    break;
  case 4:
    printf("*    * ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}

void big1(int line)
{
  switch (line)
  {
  case 1:
    printf(" *  ");
    break;
  case 2:
    printf("**  ");
    break;
  case 3:
    printf(" *  ");
    break;
  case 4:
    printf(" *  ");
    break;
  case 5:
    printf("*** ");
    break;
  }
  return;
}

void big2(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("     * ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("*      ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}

void big3(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("     * ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("     * ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}

void big4(int line)
{
  switch (line)
  {
  case 1:
    printf("*    * ");
    break;
  case 2:
    printf("*    * ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("     * ");
    break;
  case 5:
    printf("     * ");
    break;
  }
  return;
}

void big5(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("*      ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("     * ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}

void big6(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("*      ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("*    * ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}

void big7(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("    *  ");
    break;
  case 3:
    printf("   *   ");
    break;
  case 4:
    printf("  *    ");
    break;
  case 5:
    printf(" *     ");
    break;
  }
  return;
}

void big8(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("*    * ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("*    * ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}

void big9(int line)
{
  switch (line)
  {
  case 1:
    printf("****** ");
    break;
  case 2:
    printf("*    * ");
    break;
  case 3:
    printf("****** ");
    break;
  case 4:
    printf("     * ");
    break;
  case 5:
    printf("****** ");
    break;
  }
  return;
}