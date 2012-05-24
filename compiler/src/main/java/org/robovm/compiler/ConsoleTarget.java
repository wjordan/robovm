/*
 * Copyright (C) 2012 RoboVM
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler;


/**
 * @author niklas
 *
 */
public class ConsoleTarget extends AbstractTarget {

    ConsoleTarget() {
    }
    
    public static class Builder implements Target.Builder {
        private ConsoleTarget target = new ConsoleTarget();

        public void setup(Config.Builder configBuilder) {
        }
        
        public Target build(Config config) {
            target.config = config;
            return target.build(config);
        }
        
    }
}