package com.example.checkstyle;

// the below is made this way to trigger a checkstyle error. Just to test.
import java.util.*;

public class SubscriptionId {
    // 0 - 4

    public enum Type {

        END_USER_E164("0"),
        END_USER_IMSI("1"),
        END_USER_SIP_URI("2"),
        END_USER_NAI("3"),
        END_USER_PRIVATE("4");

        private String key;

        private static final Map lookup = new HashMap();

        static {
            for (Type item : EnumSet.allOf(Type.class)) {
                lookup.put(item.key, item);
            }
        }

        private Type(String key) {
            this.key = key;
        }

        public static Object get(String key) {
            return lookup.get(key);
        }

        public String getKey() {
            return key;
        }
    }

    private Type type;
    private String data;

    public SubscriptionId() {
    }

    public SubscriptionId(Type type, String data) {
        this.type = type;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}