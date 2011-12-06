/*
 * Copyright (c) 2008 Nanometrics Inc.
 *
 *	Permission is hereby granted, free of charge, to any person obtaining a copy
 *	of this software and associated documentation files (the "Software"), to deal
 *	in the Software without restriction, including without limitation the rights
 *	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *	copies of the Software, and to permit persons to whom the Software is
 *	furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in
 *	all copies or substantial portions of the Software.
 *
 *	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *	THE SOFTWARE.
 */
package ca.nanometrics.gflot.client.options;


/**
 * @author Alexander De Leon
 */
public class AxisOptions
    extends AbstractAxisOptions
{

    /**
     * Set the tick interval size. If you set it to 2, you'll get ticks at 2, 4, 6, etc.
     */
    public AxisOptions setTickSize( double tickSize )
    {
        put( "tickSize", new Double( tickSize ) );
        return this;
    }

    /**
     * Set that you don't want ticks at a size less than the specified one
     */
    public AxisOptions setMinTickSize( double minTickSize )
    {
        put( "minTickSize", new Double( minTickSize ) );
        return this;
    }

    /**
     * Set the number of decimals to display (default is auto-detected).
     */
    public AxisOptions setTickDecimals( double tickDecimals )
    {
        put( "tickDecimals", new Double( tickDecimals ) );
        return this;
    }
}