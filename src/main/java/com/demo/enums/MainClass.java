package com.demo.enums;

import java.util.function.Consumer;

public class MainClass {
    private final NestedClass nestedObject;

    private MainClass(Builder builder) {
        this.nestedObject = builder.nestedObject;
    }

    public static class Builder {
        private NestedClass nestedObject;

        public Builder withNestedObject(Consumer<NestedClass.Builder> nestedBuilderConsumer) {
            NestedClass.Builder nestedBuilder = new NestedClass.Builder();
            nestedBuilderConsumer.accept(nestedBuilder);
            this.nestedObject = nestedBuilder.build();
            return this;
        }

        public MainClass build() {
            return new MainClass(this);
        }
    }

    public static class NestedClass {
        private final String property;

        private NestedClass(Builder builder) {
            this.property = builder.property;
        }

        public static class Builder {
            private String property;

            public Builder withProperty(String property) {
                this.property = property;
                return this;
            }

            public NestedClass build() {
                return new NestedClass(this);
            }
        }
    }

    @Override
    public String toString() {
        return "MainClass{" +
                "nestedObject=" + nestedObject.property +
                '}';
    }

    public static void main(String[] args) {
        MainClass mainObject = new MainClass.Builder()
                .withNestedObject(nestedBuilder -> nestedBuilder.withProperty("Nested Property Value"))
                .build();

        System.out.println(mainObject);
    }
}
