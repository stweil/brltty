/*
 * BRLTTY - A background process providing access to the console screen (when in
 *          text mode) for a blind person using a refreshable braille display.
 *
 * Copyright (C) 1995-2020 by The BRLTTY Developers.
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

package org.a11y.brltty.android;

import android.content.res.Resources;

public abstract class InternalActivityComponent {
  private final InternalActivity owningActivity;

  protected InternalActivityComponent (InternalActivity owner) {
    owningActivity = owner;
  }

  protected final InternalActivity getActivity () {
    return owningActivity;
  }

  protected final String getString (int resource, boolean untranslated) {
    if (untranslated) getActivity().getResourceString(resource);
    return getActivity().getString(resource);
  }

  protected final String getString (int resource) {
    return getString(resource, false);
  }

  protected final Resources getResources () {
    return getActivity().getResources();
  }
}
