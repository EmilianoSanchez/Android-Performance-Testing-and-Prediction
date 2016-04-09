package com.emiliano.examplesatt.examples.dummysample;

import com.emiliano.androidTestTool.core.TestPlanImpl;
import com.emiliano.androidTestTool.core.metrics.operation.ResponseTimeMetric;

import android.content.Context;

public class TestPlanDummySample extends TestPlanImpl<Integer[], Integer> {

	public TestPlanDummySample(Context context) {
		super("Test plan dummy sample", context);
		this.addComponents(new AdditionWithRandomDelayComponent(0, 500));
		this.addComponents(new AdditionWithRandomDelayComponent(500, 1000));
		this.addComponents(new AdditionWithRandomDelayComponent(1000, 2000));

		this.addInputs(new Integer[] { 1, 2, 3 });
		this.addInputs(new Integer[] { 4, 5, 6 });
		this.addInputs(new Integer[] { 7, 8, 9 });

		// this.addOperationMetrics(new
		// MeasurerTestPlanName<Integer[],Integer>());
		this.addOperationMetrics(new ResponseTimeMetric());
		// this.addOperationMetrics(new MeasureOperationResult());
	}

}
