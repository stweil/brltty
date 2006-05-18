/*
 * BRLTTY - A background process providing access to the console screen (when in
 *          text mode) for a blind person using a refreshable braille display.
 *
 * Copyright (C) 1995-2006 by The BRLTTY Developers.
 *
 * BRLTTY comes with ABSOLUTELY NO WARRANTY.
 *
 * This is free software, placed under the terms of the
 * GNU General Public License, as published by the Free Software
 * Foundation.  Please see the file COPYING for details.
 *
 * Web Page: http://mielke.cc/brltty/
 *
 * This software is maintained by Dave Mielke <dave@mielke.cc>.
 */

#include <pc.h>

int
canBeep (void) {
  return 1;
}

int
asynchronousBeep (unsigned short frequency, unsigned short milliseconds) {
  return 0;
}

int
synchronousBeep (unsigned short frequency, unsigned short milliseconds) {
  return 0;
}

int
startBeep (unsigned short frequency) {
  sound(frequency);
  return 1;
}

int
stopBeep (void) {
  nosound();
  return 1;
}

void
endBeep (void) {
}
