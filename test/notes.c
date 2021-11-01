

int main(void)
{

  char string1[] = "string"; // gcc compiler puts {'s','t','r','i','n','g', '\0'} puts this onto the stack

  char *string2 = "string"; // gcc puts the pointer onto stack and {'s','t','r','i','n','g','\0'} in static memory area(immutable).
  return 0;
}