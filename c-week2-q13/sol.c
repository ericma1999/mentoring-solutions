
#include <math.h>
#include "graphics.h"

int main(void)
{
  double theta;
  double radius;
  double stepper = 0.05;
  int step;
  double originX = 200;
  double originY = 200;

  for (step = 0; step < 2000; step++)
  {
    // increase the radius to make the points continue outwards generating a spiral
    radius = 75.0 * step / 1500;
    theta += stepper;
    int x = originX + (int)(radius * cos(theta));
    int y = originY + (int)(radius * sin(theta));
    drawRect(x, y, 1, 1);
  }

  return 0;
}