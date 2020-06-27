/*
 * libbrlapi - A library providing access to braille terminals for applications.
 *
 * Copyright (C) 2006-2020 by
 *   Samuel Thibault <Samuel.Thibault@ens-lyon.org>
 *   Sébastien Hinderer <Sebastien.Hinderer@ens-lyon.org>
 *
 * libbrlapi comes with ABSOLUTELY NO WARRANTY.
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

package org.a11y.brlapi.clients;
import org.a11y.brlapi.*;

public class DriverKeysClient extends Client {
  public DriverKeysClient (String[] arguments) {
    super(arguments);
  }

  @Override
  protected final void runProgram () {
    connect(
      new ClientTask() {
        @Override
        public void run (Connection connection) {
          Parameters parameters = connection.getParameters();

          for (long code : parameters.definedDriverKeycodes.get()) {
            show(
              parameters.driverKeycodeName.get(code)
            );
          }
        }
      }
    );
  }
}