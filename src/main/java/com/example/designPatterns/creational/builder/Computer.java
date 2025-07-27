package com.example.designPatterns.creational.builder;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;

@Getter
@Serdeable
public class Computer {
    private final String ram;
    private final String motherboard;
    private final boolean bluetooth;
    private final boolean wifi;

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                '}';
    }

    private Computer(String ram, String motherboard, boolean bluetooth, boolean wifi) {
        this.ram = ram;
        this.motherboard = motherboard;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }

    public static class ComputerBuilder {
        private final String ram;
        private final String motherboard;
        private boolean bluetooth;
        private boolean wifi;

        public ComputerBuilder(String ram, String motherboard) {
            this.ram = ram;
            this.motherboard = motherboard;
        }

        public ComputerBuilder bluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public ComputerBuilder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this.ram, this.motherboard, this.bluetooth, this.wifi);
        }
    }
}
