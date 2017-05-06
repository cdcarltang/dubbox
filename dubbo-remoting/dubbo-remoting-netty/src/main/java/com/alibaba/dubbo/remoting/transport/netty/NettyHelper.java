/*
 * Copyright 1999-2011 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.remoting.transport.netty;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

import io.netty.util.internal.logging.AbstractInternalLogger;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * @author <a href="mailto:gang.lvg@taobao.com">kimi</a>
 */
final class NettyHelper {

    public static void setNettyLoggerFactory() {
        InternalLoggerFactory factory = InternalLoggerFactory.getDefaultFactory();
        if (factory == null || !(factory instanceof DubboLoggerFactory)) {
            InternalLoggerFactory.setDefaultFactory(new DubboLoggerFactory());
        }
    }

    static class DubboLoggerFactory extends InternalLoggerFactory {

        @Override
        public InternalLogger newInstance(String name) {
            return new DubboLogger(name);
        }
    }

    static class DubboLogger extends AbstractInternalLogger {

        private Logger logger;

        DubboLogger(String name) {
        	super(name);
            this.logger = LoggerFactory.getLogger(name);
        }

        public boolean isDebugEnabled() {
            return logger.isDebugEnabled();
        }

        public boolean isInfoEnabled() {
            return logger.isInfoEnabled();
        }

        public boolean isWarnEnabled() {
            return logger.isWarnEnabled();
        }

        public boolean isErrorEnabled() {
            return logger.isErrorEnabled();
        }

        public void debug(String msg) {
            logger.debug(msg);
        }

        public void debug(String msg, Throwable cause) {
            logger.debug(msg, cause);
        }

        public void info(String msg) {
            logger.info(msg);
        }

        public void info(String msg, Throwable cause) {
            logger.info(msg, cause);
        }

        public void warn(String msg) {
            logger.warn(msg);
        }

        public void warn(String msg, Throwable cause) {
            logger.warn(msg, cause);
        }

        public void error(String msg) {
            logger.error(msg);
        }

        public void error(String msg, Throwable cause) {
            logger.error(msg, cause);
        }

        @Override
        public String toString() {
            return logger.toString();
        }

		@Override
		public boolean isTraceEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void trace(String msg) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void trace(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void trace(String format, Object argA, Object argB) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void trace(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void trace(String msg, Throwable t) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void debug(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void debug(String format, Object argA, Object argB) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void debug(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void info(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void info(String format, Object argA, Object argB) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void info(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void warn(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void warn(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void warn(String format, Object argA, Object argB) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void error(String format, Object arg) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void error(String format, Object argA, Object argB) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void error(String format, Object... arguments) {
			// TODO Auto-generated method stub
			
		}
    }

}
