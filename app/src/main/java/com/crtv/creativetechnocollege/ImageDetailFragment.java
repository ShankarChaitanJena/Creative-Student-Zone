package com.crtv.creativetechnocollege;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.example.creativetechnocollege.R;

public class ImageDetailFragment extends Fragment {

    private ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;
    private float minScaleFactor = 1.0f;
    private float maxScaleFactor = 5.0f;
    private float focusX, focusY;

    public ImageDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_detail, container, false);
        imageView = view.findViewById(R.id.imageViewDetail);

        // Get the clicked image bitmap from arguments
        Bundle bundle = getArguments();
        if (bundle != null) {
            Bitmap clickedImage = bundle.getParcelable("clicked_image");
            if (clickedImage != null) {
                imageView.setImageBitmap(clickedImage);
            }
        }

        // Set up pinch-to-zoom gesture detector
        scaleGestureDetector = new ScaleGestureDetector(getActivity(), new ScaleListener());

        // Set touch listener for zooming
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getPointerCount() > 1) {
                    focusX = event.getX() / 2;
                    focusY = event.getY() / 2;
                }
                scaleGestureDetector.onTouchEvent(event);
                return true;
            }
        });

        return view;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scaleFactor *= detector.getScaleFactor();
            scaleFactor = Math.max(minScaleFactor, Math.min(scaleFactor, maxScaleFactor));
            imageView.setScaleX(scaleFactor);
            imageView.setScaleY(scaleFactor);
            imageView.setPivotX(focusX);
            imageView.setPivotY(focusY);
            return true;
        }
    }
}
