package ru.yandex.practicum.catsgram.exception;

public class ParameterNotValidException extends IllegalArgumentException {
    private final String parameter;
    private final String reason;

    public ParameterNotValidException(String parameter, String reason) {
        this.parameter = parameter;
        this.reason = reason;
    }

    @Override
    public String getMessage() {
        return String.format("Некорректное значение параметра %s: %s", parameter, reason);
    }
}
