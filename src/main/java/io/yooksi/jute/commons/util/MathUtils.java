/*
 * Copyright [2019] [Matthew Cain]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.yooksi.jute.commons.util;

import io.yooksi.jute.commons.define.MethodsNotNull;

import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.math.RoundingMode;

@MethodsNotNull
@SuppressWarnings("unused")
public class MathUtils {

    /**
     * <p>Truncate the given number to {@code N} decimal places, with {@code N} being defined with the
     * {@code precision} method parameter value. Note that this will not perform a rounding operation
     * on the given value but simply remove the excess numbers passed the precision point.
     *
     * <p>
     *     The regular case-use to truncate to given number of decimal places:
     * <pre>
     * MathUtils.truncateDecimals(0.94253, 2) = 0.94
     * </pre>
     * <p>
     *     If the defined precision on a <i>de-facto</i> integer number the value will not change:
     * <pre>
     * MathUtils.truncateDecimals(1.0, 1) = 1.0
     * MathUtils.truncateDecimals(0.0, 0) = 0.0
     * </pre>
     * <p>
     *     The same value will also be returned if the precision matches the amount of decimals:
     * <pre>
     * MathUtils.truncateDecimals(0.42, 2) = 0.42
     * MathUtils.truncateDecimals(3.253, 3) = 3.253
     * </pre>
     * <p>
     *     Or the precision exceeds the amount of decimals held by the given value:
     * <pre>
     * MathUtils.truncateDecimals(1, 4) = 1.0
     * MathUtils.truncateDecimals(25.0000, 2) = 25.0
     * </pre>
     * <p>
     *     Negative values are fully supported and are treated exactly like positives:
     * <pre>
     * MathUtils.truncateDecimals(-1, 0) = -1
     * MathUtils.truncateDecimals(-1.12, 2) = -1.12
     * MathUtils.truncateDecimals(-99.8424, 1) = -99.8
     * </pre>
     *
     * The rounding mode used for setting {@code BigDecimal} scale is {@link RoundingMode#FLOOR}
     * for positive numbers and {@link RoundingMode#CEILING} for negative numbers.
     *
     * @param value decimal number to truncate
     * @param precision decimal places to limit the return value to
     * @return value with limited decimal places according to the given precision
     *
     * @throws IllegalArgumentException if {@code precision} is a negative value
     * @see BigDecimal#BigDecimal(String)
     */
    public static double truncateDecimals(double value, @PositiveOrZero int precision) {

        if (precision < 0) {
            throw new IllegalArgumentException("Decimal precision value cannot be a negative number.");
        }
        RoundingMode roundingMode = value > 0 ? RoundingMode.FLOOR : RoundingMode.CEILING;
        return new BigDecimal(String.valueOf(value)).setScale(precision, roundingMode).doubleValue();
    }
}
