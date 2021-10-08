/*
 * BRLTTY - A background process providing access to the console screen (when in
 *          text mode) for a blind person using a refreshable braille display.
 *
 * Copyright (C) 1995-2021 by The BRLTTY Developers.
 *
 * BRLTTY comes with ABSOLUTELY NO WARRANTY.
 *
 * This is free software, placed under the terms of the
 * GNU Lesser General Public License, as published by the Free Software
 * Foundation; either version 2.1 of the License, or (at your option) any
 * later version. Please see the file LICENSE-LGPL for details.
 *
 * Web Page: http://brltty.app/
 *
 * This software is maintained by Dave Mielke <dave@mielke.cc>.
 */

#include "prologue.h"

#include <string.h>

#include "log.h"
#include "io_hid.h"

void
hidInitializeDeviceDescription_USB (HidDeviceDescription_USB *description) {
  memset(description, 0, sizeof(*description));

  description->manufacturerName = NULL;
  description->productName = NULL;
  description->serialNumber = NULL;

  description->vendorIdentifier = 0;
  description->productIdentifier = 0;
}

void
hidInitializeDeviceDescription_Bluetooth (HidDeviceDescription_Bluetooth *description) {
  memset(description, 0, sizeof(*description));

  description->deviceAddress = NULL;
}
