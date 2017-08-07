//package bwei.admin.wurui20170807;
//
//import android.content.Context;
//import android.content.res.TypedArray;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.Rect;
//import android.support.annotation.Nullable;
//import android.util.AttributeSet;
//import android.util.TypedValue;
//import android.view.View;
//
///**
// * 类描述：
// * 创建人：WuRui
// * 创建时间：2017/8/7 9:02
// */
//public class MyView extends View {
//    //文本
//    private String mTitleText;
//    //背景颜色
//    private int mTitleTextBackGroud;
//    //文本的颜色
//    private int mTitleTextColor;
//    //文本的大小
//    private int mTitleTextSize;
//    //绘制时控制文本绘制的范围
//    private Rect mBound;
//    private Paint mPaint;
//
//    public MyView(Context context) {
//        super(context);
//    }
//
//    public MyView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        /**
//         * 获得我们所定义的自定义样式属性
//         */
//        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomTitleView,defStyleAttr, 0);
//        int n = a.getIndexCount();
//        for (int i = 0; i < n; i++) {
//            int attr = a.getIndex(i);
//            switch (attr) {
//                case R.styleable.CustomTitleView_titleText:
//                    mTitleText = a.getString(attr);
//                    break;
//                case R.styleable.CustomTitleView_titleTextColor:
//                    // 默认颜色设置为黑色
//                    mTitleTextColor = a.getColor(attr, Color.BLACK);
//                    break;
//                case R.styleable.CustomTitleView_titleTextSize:
//                    // 默认设置为16sp，TypeValue也可以把sp转化为px
//                    mTitleTextSize = a.getDimensionPixelSize(attr, (int) TypedValue.applyDimension(
//                            TypedValue.COMPLEX_UNIT_SP, 16, getResources().getDisplayMetrics()));
//                    break;
//            }
//        }
//        a.recycle();
//
//        /**
//         * 获得绘制文本的宽和高
//         */
//        mPaint = new Paint();
//        mPaint.setTextSize(mTitleTextSize);
//        // mPaint.setColor(mTitleTextColor);
//        mBound = new Rect();
//        mPaint.getTextBounds(mTitleText, 0, mTitleText.length(), mBound);
//    }
//
//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        mPaint.setColor(Color.YELLOW);
//        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint);
//
//        mPaint.setColor(mTitleTextColor);
//        canvas.drawText(mTitleText, getWidth() / 2 - mBound.width() / 2, getHeight() / 2 + mBound.height() / 2, mPaint);
//    }
//}
