package com.jetbrains.inspections;

@SuppressWarnings({"unused", "UnnecessaryLocalVariable"})
public class Java13Inspections {

    private PortType switchExpressionCanReturnWithYield(int port) {
        PortType type = switch (port) {
            case 20 -> PortType.FTP;
            case 80, 8080 -> PortType.HTTP;
            case 27017 -> PortType.DATABASE;
            default -> PortType.UNKNOWN;
        };
        return type;
    }

    private enum PortType {
        HTTP, DATABASE, UNUSED, UNKNOWN, FTP, BUSY, SAFE
    }

}
